FROM node:22-alpine

WORKDIR /app

COPY package*.json ./

RUN npm install --legacy-peer-deps && \
    npm install @mui/material @emotion/react @emotion/styled --legacy-peer-deps && \
    npm install @fortawesome/fontawesome-svg-core @fortawesome/react-fontawesome --legacy-peer-deps

COPY . .

EXPOSE 4173

# Command to start the application.
CMD ["npm", "run", "start"]
