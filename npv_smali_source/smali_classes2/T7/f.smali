.class public final LT7/f;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lg8/t;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LT7/f$a;
    }
.end annotation


# static fields
.field public static final c:LT7/f$a;


# instance fields
.field private final a:Ljava/lang/Class;

.field private final b:Lh8/a;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, LT7/f$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, LT7/f$a;-><init>(Ly7/k;)V

    sput-object v0, LT7/f;->c:LT7/f$a;

    return-void
.end method

.method private constructor <init>(Ljava/lang/Class;Lh8/a;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LT7/f;->a:Ljava/lang/Class;

    iput-object p2, p0, LT7/f;->b:Lh8/a;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Class;Lh8/a;Ly7/k;)V
    .locals 0

    invoke-direct {p0, p1, p2}, LT7/f;-><init>(Ljava/lang/Class;Lh8/a;)V

    return-void
.end method


# virtual methods
.method public a(Lg8/t$d;[B)V
    .locals 1

    const-string p2, "visitor"

    invoke-static {p1, p2}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object p2, LT7/c;->a:LT7/c;

    iget-object v0, p0, LT7/f;->a:Ljava/lang/Class;

    invoke-virtual {p2, v0, p1}, LT7/c;->i(Ljava/lang/Class;Lg8/t$d;)V

    return-void
.end method

.method public b()Lh8/a;
    .locals 1

    iget-object v0, p0, LT7/f;->b:Lh8/a;

    return-object v0
.end method

.method public c()Ln8/b;
    .locals 1

    iget-object v0, p0, LT7/f;->a:Ljava/lang/Class;

    invoke-static {v0}, LU7/d;->a(Ljava/lang/Class;)Ln8/b;

    move-result-object v0

    return-object v0
.end method

.method public d(Lg8/t$c;[B)V
    .locals 1

    const-string p2, "visitor"

    invoke-static {p1, p2}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object p2, LT7/c;->a:LT7/c;

    iget-object v0, p0, LT7/f;->a:Ljava/lang/Class;

    invoke-virtual {p2, v0, p1}, LT7/c;->b(Ljava/lang/Class;Lg8/t$c;)V

    return-void
.end method

.method public e()Ljava/lang/String;
    .locals 8

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v1, p0, LT7/f;->a:Ljava/lang/Class;

    invoke-virtual {v1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v2

    const-string v1, "getName(...)"

    invoke-static {v2, v1}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v6, 0x4

    const/4 v7, 0x0

    const/16 v3, 0x2e

    const/16 v4, 0x2f

    const/4 v5, 0x0

    invoke-static/range {v2 .. v7}, LS8/r;->Q(Ljava/lang/String;CCZILjava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ".class"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 1

    .prologue
    instance-of v0, p1, LT7/f;

    if-eqz v0, :cond_0

    iget-object v0, p0, LT7/f;->a:Ljava/lang/Class;

    check-cast p1, LT7/f;

    iget-object p1, p1, LT7/f;->a:Ljava/lang/Class;

    invoke-static {v0, p1}, Ly7/t;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method

.method public final f()Ljava/lang/Class;
    .locals 1

    iget-object v0, p0, LT7/f;->a:Ljava/lang/Class;

    return-object v0
.end method

.method public hashCode()I
    .locals 1

    iget-object v0, p0, LT7/f;->a:Ljava/lang/Class;

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-class v1, LT7/f;

    invoke-virtual {v1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ": "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, LT7/f;->a:Ljava/lang/Class;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
