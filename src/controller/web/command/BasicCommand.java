package controller.web.command;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public interface BasicCommand {

    void performAction(HttpServletRequest req, HttpServletResponse resp) throws IOException;
}
