from flask import Flask,render_template
app = Flask(__name__)

@app.route("/")
def hello():
	tv_show="the office"
	return render_template("index.html", show=tv_show)

if __name__ == "__main__":
    app.run()
