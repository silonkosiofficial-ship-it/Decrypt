.class public final LG6/t;
.super Ljava/lang/IllegalArgumentException;
.source "SourceFile"

# interfaces
.implements LW8/D;


# instance fields
.field private final C:Lg7/b;


# direct methods
.method public constructor <init>(Lg7/b;)V
    .locals 2

    const-string v0, "frame"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Unsupported frame type: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    iput-object p1, p0, LG6/t;->C:Lg7/b;

    return-void
.end method


# virtual methods
.method public bridge synthetic a()Ljava/lang/Throwable;
    .locals 1

    invoke-virtual {p0}, LG6/t;->b()LG6/t;

    move-result-object v0

    return-object v0
.end method

.method public b()LG6/t;
    .locals 2

    new-instance v0, LG6/t;

    iget-object v1, p0, LG6/t;->C:Lg7/b;

    invoke-direct {v0, v1}, LG6/t;-><init>(Lg7/b;)V

    invoke-virtual {v0, p0}, Ljava/lang/Throwable;->initCause(Ljava/lang/Throwable;)Ljava/lang/Throwable;

    return-object v0
.end method
