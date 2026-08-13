.class final La8/a$a;
.super Ly7/v;
.source "SourceFile"

# interfaces
.implements Lx7/a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = La8/a;->c(La8/g;LO7/g;Le8/z;I)La8/g;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic D:La8/g;

.field final synthetic E:LO7/g;


# direct methods
.method constructor <init>(La8/g;LO7/g;)V
    .locals 0

    iput-object p1, p0, La8/a$a;->D:La8/g;

    iput-object p2, p0, La8/a$a;->E:LO7/g;

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Ly7/v;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a()LX7/y;
    .locals 2

    iget-object v0, p0, La8/a$a;->D:La8/g;

    iget-object v1, p0, La8/a$a;->E:LO7/g;

    invoke-interface {v1}, LP7/a;->k()LP7/g;

    move-result-object v1

    invoke-static {v0, v1}, La8/a;->g(La8/g;LP7/g;)LX7/y;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic b()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, La8/a$a;->a()LX7/y;

    move-result-object v0

    return-object v0
.end method
