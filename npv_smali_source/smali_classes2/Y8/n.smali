.class public final LY8/n;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LY8/n$a;,
        LY8/n$b;,
        LY8/n$c;
    }
.end annotation


# static fields
.field public static final b:LY8/n$b;

.field private static final c:LY8/n$c;


# instance fields
.field private final a:Ljava/lang/Object;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, LY8/n$b;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, LY8/n$b;-><init>(Ly7/k;)V

    sput-object v0, LY8/n;->b:LY8/n$b;

    new-instance v0, LY8/n$c;

    invoke-direct {v0}, LY8/n$c;-><init>()V

    sput-object v0, LY8/n;->c:LY8/n$c;

    return-void
.end method

.method private synthetic constructor <init>(Ljava/lang/Object;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LY8/n;->a:Ljava/lang/Object;

    return-void
.end method

.method public static final synthetic a()LY8/n$c;
    .locals 1

    sget-object v0, LY8/n;->c:LY8/n$c;

    return-object v0
.end method

.method public static final synthetic b(Ljava/lang/Object;)LY8/n;
    .locals 1

    new-instance v0, LY8/n;

    invoke-direct {v0, p0}, LY8/n;-><init>(Ljava/lang/Object;)V

    return-object v0
.end method

.method public static c(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    return-object p0
.end method

.method public static d(Ljava/lang/Object;Ljava/lang/Object;)Z
    .locals 2

    .prologue
    instance-of v0, p1, LY8/n;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return v1

    :cond_0
    check-cast p1, LY8/n;

    invoke-virtual {p1}, LY8/n;->l()Ljava/lang/Object;

    move-result-object p1

    invoke-static {p0, p1}, Ly7/t;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_1

    return v1

    :cond_1
    const/4 p0, 0x1

    return p0
.end method

.method public static final e(Ljava/lang/Object;)Ljava/lang/Throwable;
    .locals 2

    .prologue
    instance-of v0, p0, LY8/n$a;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    check-cast p0, LY8/n$a;

    goto :goto_0

    :cond_0
    move-object p0, v1

    :goto_0
    if-eqz p0, :cond_1

    iget-object v1, p0, LY8/n$a;->a:Ljava/lang/Throwable;

    :cond_1
    return-object v1
.end method

.method public static final f(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .prologue
    instance-of v0, p0, LY8/n$c;

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    return-object p0
.end method

.method public static final g(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    .prologue
    instance-of v0, p0, LY8/n$c;

    if-nez v0, :cond_0

    return-object p0

    :cond_0
    instance-of v0, p0, LY8/n$a;

    if-eqz v0, :cond_1

    move-object v0, p0

    check-cast v0, LY8/n$a;

    iget-object v0, v0, LY8/n$a;->a:Ljava/lang/Throwable;

    if-eqz v0, :cond_1

    throw v0

    :cond_1
    new-instance v0, Ljava/lang/IllegalStateException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Trying to call \'getOrThrow\' on a failed channel result: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, p0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public static h(Ljava/lang/Object;)I
    .locals 0

    .prologue
    if-nez p0, :cond_0

    const/4 p0, 0x0

    goto :goto_0

    :cond_0
    invoke-virtual {p0}, Ljava/lang/Object;->hashCode()I

    move-result p0

    :goto_0
    return p0
.end method

.method public static final i(Ljava/lang/Object;)Z
    .locals 0

    instance-of p0, p0, LY8/n$a;

    return p0
.end method

.method public static final j(Ljava/lang/Object;)Z
    .locals 0

    instance-of p0, p0, LY8/n$c;

    xor-int/lit8 p0, p0, 0x1

    return p0
.end method

.method public static k(Ljava/lang/Object;)Ljava/lang/String;
    .locals 2

    .prologue
    instance-of v0, p0, LY8/n$a;

    if-eqz v0, :cond_0

    check-cast p0, LY8/n$a;

    invoke-virtual {p0}, LY8/n$a;->toString()Ljava/lang/String;

    move-result-object p0

    goto :goto_0

    :cond_0
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Value("

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const/16 p0, 0x29

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    :goto_0
    return-object p0
.end method


# virtual methods
.method public equals(Ljava/lang/Object;)Z
    .locals 1

    iget-object v0, p0, LY8/n;->a:Ljava/lang/Object;

    invoke-static {v0, p1}, LY8/n;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method

.method public hashCode()I
    .locals 1

    iget-object v0, p0, LY8/n;->a:Ljava/lang/Object;

    invoke-static {v0}, LY8/n;->h(Ljava/lang/Object;)I

    move-result v0

    return v0
.end method

.method public final synthetic l()Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, LY8/n;->a:Ljava/lang/Object;

    return-object v0
.end method

.method public toString()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, LY8/n;->a:Ljava/lang/Object;

    invoke-static {v0}, LY8/n;->k(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
