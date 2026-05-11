package com.websitegood.main.main;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class start {

    @GetMapping("start")
    public String count() {
        return """
        <html>
                <head>
                    <title> Website SuperCool </title>
                    <style>
                        .grid {
                            display: grid;
                            grid-template-columns: auto auto auto;
                            padding: 10px;
                        }
                        .grid div {
                            text-align: center;
                            border: 1px;
                            padding: 5px;
                            padding-bottom: 20px;
                            font-size: 30px;
                            border: 1px solid black;
                        }
                        .title {
                            text-align: center;
                            font-size: 60px;
                        }
                    </style>
                </head>


                <body>
                    <h1 class="title"> Hello world</h1>
                    <div class="grid">
                        <div>
                            1st spot
                            <p> empty </p>
                        </div>
                        <div>
                            2nd spot
                            <p> empty </p>
                        </div>
                        <div>
                            3rd spot
                            <p> empty </p>
                        </div>
                        <div>
                            4th spot
                            <p> empty </p>
                        </div>
                        <div>
                            5th spot
                            <p> empty </p>
                        </div>
                        <div>
                            6th spot
                            <p> empty </p>
                        </div>

                    </div>
                </body>
            <html>""";
    }
}
