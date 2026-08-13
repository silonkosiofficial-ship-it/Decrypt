.class public final Lio/ktor/utils/io/t;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LW8/N;


# instance fields
.field private final C:Lio/ktor/utils/io/g;

.field private final D:Lm7/i;


# direct methods
.method public constructor <init>(Lio/ktor/utils/io/g;Lm7/i;)V
    .locals 1

    const-string v0, "channel"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "coroutineContext"

    invoke-static {p2, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lio/ktor/utils/io/t;->C:Lio/ktor/utils/io/g;

    iput-object p2, p0, Lio/ktor/utils/io/t;->D:Lm7/i;

    return-void
.end method


# virtual methods
.method public final a()Lio/ktor/utils/io/g;
    .locals 1

    iget-object v0, p0, Lio/ktor/utils/io/t;->C:Lio/ktor/utils/io/g;

    return-object v0
.end method

.method public getCoroutineContext()Lm7/i;
    .locals 1

    iget-object v0, p0, Lio/ktor/utils/io/t;->D:Lm7/i;

    return-object v0
.end method
