import { Noticia } from "./components/Noticia"

export function App() {

  const user = {
    name: "Hugo",
    email: "hugo@gmail.com"
  }

  return (
    <>
      <Noticia 
        title="Apagao terca feira" 
        user={user}
        content="Algum conteudo"
      />
    </>
  )
}