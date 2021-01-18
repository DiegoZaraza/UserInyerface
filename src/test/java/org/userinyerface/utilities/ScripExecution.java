package org.userinyerface.utilities;

import java.io.IOException;

public class ScripExecution {
    public void uploadFile(String file) throws IOException, InterruptedException {
        Runtime runtime = Runtime.getRuntime();
        String appleScriptCommand = "tell application \"System Events\"\n" +
                "delay 1\n" +
                "keystroke \"G\" using {command down, shift down}\n" +
                "delay 1\n" +
                "keystroke \"/Users/diegozaraza/Documents/GitHub/userinyerface/src/test/resources/avatar.png\"\n" +
                "delay 1\n" +
                "keystroke return\n" +
                "delay 1\n" +
                "keystroke return\n" +
                "end tell";

        String[] args = {"osascript", "-e", appleScriptCommand};

        Process process = runtime.exec(args);
        Thread.sleep(30000);
    }
}
