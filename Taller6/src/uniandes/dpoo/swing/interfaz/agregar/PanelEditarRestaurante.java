package uniandes.dpoo.swing.interfaz.agregar;

import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

@SuppressWarnings("serial")
public class PanelEditarRestaurante extends JPanel
{
    /**
     * La opción del selector que indica que el restaurante ya fue visitado
     */
    private static final String SI = "Sí";

    /**
     * La opción del selector que indica que el restaurante todavía no ha sido visitado
     */
    private static final String NO = "No";

    /**
     * El campo para que el usuario ingrese el nombre del restaurante
     */
    private JTextField txtNombre;

    /**
     * Un selector (JComboBox) para que el usuario seleccione la calificación (1 a 5) del restaurante
     */
    private JComboBox<String> cbbCalificacion;

    /**
     * Un selector (JComboBox) para que el usuario indique si ya visitó el restaurante o no
     */
    private JComboBox<String> cbbVisitado;

    public PanelEditarRestaurante( )
    {
        // Se organiza en una cuadrícula de 3 filas x 1 columna, donde cada fila es un panel interno
        // con la etiqueta al frente y el campo de entrada a continuación
        setLayout( new GridLayout( 3, 1 ) );

        // Crea el campo para el nombre con una etiqueta al frente
        JPanel panelNombre = new JPanel( new FlowLayout( FlowLayout.LEFT ) );
        txtNombre = new JTextField( 20 );
        panelNombre.add( new JLabel( "Nombre" ) );
        panelNombre.add( txtNombre );

        // Crea el selector para la calificación con una etiqueta al frente
        JPanel panelCalificacion = new JPanel( new FlowLayout( FlowLayout.LEFT ) );
        cbbCalificacion = new JComboBox<String>( new String[] { "1", "2", "3", "4", "5" } );
        panelCalificacion.add( new JLabel( "Calificación" ) );
        panelCalificacion.add( cbbCalificacion );

        // Crea el selector para indicar si ya ha sido visitado, con una etiqueta al frente
        JPanel panelVisitado = new JPanel( new FlowLayout( FlowLayout.LEFT ) );
        cbbVisitado = new JComboBox<String>( new String[] { SI, NO } );
        panelVisitado.add( new JLabel( "Visitado" ) );
        panelVisitado.add( cbbVisitado );

        // Agregar todos los elementos al panel
        add( panelNombre );
        add( panelCalificacion );
        add( panelVisitado );
    }

    /**
     * Indica si en el selector se seleccionó la opción que dice que el restaurante fue visitado
     * @return
     */
    public boolean getVisitado( )
    {
        return SI.equals( cbbVisitado.getSelectedItem( ) );
    }

    /**
     * Indica la calificación marcada en el selector
     * @return
     */
    public int getCalificacion( )
    {
        String calif = ( String )cbbCalificacion.getSelectedItem( );
        return Integer.parseInt( calif );
    }

    /**
     * Indica el nombre digitado para el restaurante
     * @return
     */
    public String getNombre( )
    {
        return txtNombre.getText( ).trim( );
    }
}
