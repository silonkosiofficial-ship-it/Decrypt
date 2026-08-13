.class public final LM9/i;
.super Ljava/lang/RuntimeException;
.source "SourceFile"


# instance fields
.field private final C:Ljava/io/IOException;

.field private D:Ljava/io/IOException;


# direct methods
.method public constructor <init>(Ljava/io/IOException;)V
    .locals 1

    const-string v0, "firstConnectException"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, p1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    iput-object p1, p0, LM9/i;->C:Ljava/io/IOException;

    iput-object p1, p0, LM9/i;->D:Ljava/io/IOException;

    return-void
.end method


# virtual methods
.method public final a(Ljava/io/IOException;)V
    .locals 1

    const-string v0, "e"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, LM9/i;->C:Ljava/io/IOException;

    invoke-static {v0, p1}, Li7/g;->a(Ljava/lang/Throwable;Ljava/lang/Throwable;)V

    iput-object p1, p0, LM9/i;->D:Ljava/io/IOException;

    return-void
.end method

.method public final b()Ljava/io/IOException;
    .locals 1

    iget-object v0, p0, LM9/i;->C:Ljava/io/IOException;

    return-object v0
.end method

.method public final c()Ljava/io/IOException;
    .locals 1

    iget-object v0, p0, LM9/i;->D:Ljava/io/IOException;

    return-object v0
.end method
