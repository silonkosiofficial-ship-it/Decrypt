.class public final LU7/q;
.super LU7/f;
.source "SourceFile"

# interfaces
.implements Le8/m;


# instance fields
.field private final c:Ljava/lang/Enum;


# direct methods
.method public constructor <init>(Ln8/f;Ljava/lang/Enum;)V
    .locals 1

    const-string v0, "value"

    invoke-static {p2, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x0

    invoke-direct {p0, p1, v0}, LU7/f;-><init>(Ln8/f;Ly7/k;)V

    iput-object p2, p0, LU7/q;->c:Ljava/lang/Enum;

    return-void
.end method


# virtual methods
.method public b()Ln8/b;
    .locals 2

    .prologue
    iget-object v0, p0, LU7/q;->c:Ljava/lang/Enum;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Class;->isEnum()Z

    move-result v1

    if-eqz v1, :cond_0

    goto :goto_0

    :cond_0
    invoke-virtual {v0}, Ljava/lang/Class;->getEnclosingClass()Ljava/lang/Class;

    move-result-object v0

    :goto_0
    invoke-static {v0}, Ly7/t;->c(Ljava/lang/Object;)V

    invoke-static {v0}, LU7/d;->a(Ljava/lang/Class;)Ln8/b;

    move-result-object v0

    return-object v0
.end method

.method public d()Ln8/f;
    .locals 1

    iget-object v0, p0, LU7/q;->c:Ljava/lang/Enum;

    invoke-virtual {v0}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ln8/f;->o(Ljava/lang/String;)Ln8/f;

    move-result-object v0

    return-object v0
.end method
