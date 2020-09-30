package servlets;

import models.Note;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.*;

public class NoteServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String title;
        String content;
        String path = getServletContext().getRealPath("/WEB-INF/note.txt");
        BufferedReader reader = new BufferedReader(new FileReader(path));
        title = reader.readLine();
        content = reader.readLine();
        Note note = new Note(title, content);
        request.setAttribute("note", note);
        if (request.getParameter("edit") != null) {
            getServletContext().getRequestDispatcher("/WEB-INF/editNote.jsp").forward(request, response);
        } else {
            getServletContext().getRequestDispatcher("/WEB-INF/viewNote.jsp").forward(request, response);
        }
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String title;
        String content;
        String path = getServletContext().getRealPath("/WEB-INF/note.txt");
        BufferedWriter writer = new BufferedWriter(new FileWriter(path));
        title = request.getParameter("title");
        content = request.getParameter("content");
        writer.write(title + "\n" + content);
        writer.close();
        Note note = new Note(title, content);
        request.setAttribute("note", note);
        getServletContext().getRequestDispatcher("/WEB-INF/viewNote.jsp").forward(request, response);
    }
}
