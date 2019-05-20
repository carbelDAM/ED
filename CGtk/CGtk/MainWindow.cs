using System;
using Gtk;

public partial class MainWindow : Gtk.Window
{
    public MainWindow() : base(Gtk.WindowType.Toplevel)
    {
        Build();

        buttonAceptar.Clicked += delegate {
            labelSaludo.Text = "Hola " + EntryNombre.Text;

        };

        int index = 0;
        for (int row = 0; row < 9; row++)
            for (int column = 0; index < 4; index++)
        {
            Button button = new Button();
            button.Label = "Boton " + index.ToString;
            button.Visible = true;
            VBox.Add(button);
        }
    
    }

    protected void OnDeleteEvent(object sender, DeleteEventArgs a)
    {
        Application.Quit();
        a.RetVal = true;
    }
}
