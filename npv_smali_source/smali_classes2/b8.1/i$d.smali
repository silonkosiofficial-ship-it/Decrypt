.class final Lb8/i$d;
.super Ly7/v;
.source "SourceFile"

# interfaces
.implements Lx7/a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lb8/i;-><init>(La8/g;Le8/u;Lb8/h;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic D:La8/g;

.field final synthetic E:Lb8/i;


# direct methods
.method constructor <init>(La8/g;Lb8/i;)V
    .locals 0

    iput-object p1, p0, Lb8/i$d;->D:La8/g;

    iput-object p2, p0, Lb8/i$d;->E:Lb8/i;

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Ly7/v;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a()Ljava/util/Set;
    .locals 2

    iget-object v0, p0, Lb8/i$d;->D:La8/g;

    invoke-virtual {v0}, La8/g;->a()La8/b;

    move-result-object v0

    invoke-virtual {v0}, La8/b;->d()LX7/p;

    move-result-object v0

    iget-object v1, p0, Lb8/i$d;->E:Lb8/i;

    invoke-virtual {v1}, Lb8/i;->S()Lb8/h;

    move-result-object v1

    invoke-virtual {v1}, LR7/z;->e()Ln8/c;

    move-result-object v1

    invoke-interface {v0, v1}, LX7/p;->c(Ln8/c;)Ljava/util/Set;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic b()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lb8/i$d;->a()Ljava/util/Set;

    move-result-object v0

    return-object v0
.end method
