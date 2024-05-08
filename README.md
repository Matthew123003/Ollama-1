# Ollama-1
simple prompt local llm.

_generate, chat, one-shot, prompt, hallucination._


## Start

Go to Ollama (https://ollama.com) and install the app on a mac M1+


### Libraries

- [ollama-python](https://github.com/ollama/ollama-python)
- [ollama-js](https://github.com/ollama/ollama-js)

Use these to understand how you might make calls to this local LLM server using a language like Java. _Of course you can, you can do anything._

## Quickstart

To run and chat with [Llama 3](https://ollama.com/library/llama3):

```
ollama run llama3
```

or try 

```
ollama run phi3
```

Poke at it a bit. Ask it some questions. See what it can do.

## REST API

Ollama has a REST API for running and managing models.
Notice that the API is running on port 11434. On localhost. And that means _what_ to you?

What does "one-shot" mean? What does "chat" mean? What does "generate" mean?
How does "prompt" fit into it?

### Generate a response

```
curl http://localhost:11434/api/generate -d '{
  "model": "llama3",
  "prompt":"Why is the sky blue?"
}'
```

### Write a "one-shot" java program to call the API

```java
import java.io.*;
import java.net.HttpURLConnection;
import java.net.URL;

// etcc
```

### Chat with a model

```
curl http://localhost:11434/api/chat -d '{
  "model": "llama3",
  "messages": [
    { "role": "user", "content": "why is the sky blue?" }
  ]
}'
```

#### Create a chat terminal app

Now, write a small java program which calls the API and show the response.
Use "exit" to tell the program to quit.


See the [API documentation](./docs/api.md) for all endpoints.


## If AIs are so smart...

why did it give me this?

```
>>> describe ollama to complete beginner
Olláma is a traditional Andean musical instrument, also known as an "Andean pan flute," originating from the high altitude regions of Peru and Bolivia. 
It has been played for thousands of years by indigenous people in South America, particularly within the Quechua and Aymara cultures.

An olláma typically consists of a series of hollow tubes called "potos," which are made from bamboo or other locally available materials such as clay or
metal. These tubes vary in length but usually range between 25 cm (9.8 inches) to 40 cm (15.7 inches). Each poto is carefully carved and curved, 
allowing it to produce a unique sound when blown into with one's lips placed against the top edge of the tube.

The player holds several ollámas together in their hands or around their body while playing. This allows for intricate harmonies and polyphonic melodies
as each poto is tuned to a specific note within a musical scale. The resulting sound from an ensemble of ollámas has been likened to that of a full 
orchestra, with different instruments representing various pitches.

Traditional music featuring the olláma often includes folk songs and dances passed down through generations. Songs may tell stories about local history,
nature, cultural beliefs or rituals, love, or daily life in the Andean highlands. The instrument itself has a rich sound that is both hauntingly 
beautiful and deeply tied to the culture of its people.

The olláma is not only a musical tool but also a symbol of pride for the indigenous communities who continue to use it today, preserving their ancestral
music traditions while embracing contemporary influences in their compositions.
```

AND then I made a prompt mod:

```
>>> describe the ollama open source project to complete beginner. use https://wiki.mutable.ai/ollama/ollama for source information.
The Ollama Open Source Project, as referenced on the Mutable AI Wiki (https://wiki.mutable.ai/ollama/), is an initiative aimed at creating a digital 
representation of the traditional Andean musical instrument known as the olláma. This project seeks to preserve and share knowledge about this unique 
cultural artifact through interactive, educational resources that are accessible online for anyone interested in learning more about it or experienited 
its sounds.

The Ollama Open Source Project encompasses several key components:

1. Digital Modeling: Using 3D modeling software, the project creates a digital representation of an olláma ensemble consisting of multiple potsos (the 
tubes that make up the instrument). This allows users to explore and interact with virtual instruments in real-time. They can rotate, zoom, or simulate 
blowing air into each poto using customized controls.

2. Virtual Performance: By combining digital modeling with sound synthesis techniques, users have the ability to create a full musical performance 
featuring ollámas from the comfort of their own computer. This allows them to experience various traditional Andean melodies and rhythms without needing
access to physical instruments or in-person performances.

3. Educational Content: The Ollama Open Source Project also focuses on providing informative content for learners interested in the history, cultural 
significance, construction techniques, and playing methods of traditional Andean music using ollámas. This includes articles, videos, tutorials, and 
interactive lessons that cater to both beginners and advanced users.

4. Community Engagement: The project encourages collaboration among enthusiasts, musicians, educators, and cultural preservationists by offering a 
platform for sharing resources, discussing ideas, and promoting the continued use of ollámas in contemporary music-making. This openness fosters a 
supportive environment where users can contribute their knowledge, experience, or feedback to improve and expand the project's offerings.

By making traditional Andean musical instruments like the olláma accessible through an online platform, The Ollama Open Source Project seeks to bridge 
cultural gaps while providing educational resources for enthusiasts worldwide. It also serves as a digital archive that safeguards knowledge and 
promotes appreciation of indigenous music traditions in our increasingly interconnected global community.
```

Can you define the idea of __hallucination__ yet? No? Well, check out [https://wiki.mutable.ai/ollama/ollama](https://wiki.mutable.ai/ollama/ollama) for more information. AND then, can you explain what is going on here? 

Why do we use the word _hallucination_ instead of _lie_? Don't you think that's a bit _hallucinatory_? Don't liars have to be intentional? So, does this model have _intent_?

Hmm. And these tools are gonna replace us soon? I don't think so. _(yet?)_
