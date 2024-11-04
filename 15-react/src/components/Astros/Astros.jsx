
import Navbar from "../Navbar/Navbar";
import Astro from "./AstroCard/Astro";
import useAstros from "./hooks/useAstros";

export default function Astros() {

    // Utilizamos el componentes Astros para modificar el estado del mismo utilizando useState. Para ello, usamos Astro como tarjeta base (Card) y llenamos su información consumiendo una API con useEffect.

    const astros = useAstros();

    return (
        <>
        <Navbar />

        {
            astros.map((astro, index) =>
                // <Astro name={astro.name} craft={astro.craft} />
                <Astro key={index} {...astro} />
            )
        }

        </>
    )
}
