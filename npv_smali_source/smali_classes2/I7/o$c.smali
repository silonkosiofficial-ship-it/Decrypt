.class final LI7/o$c;
.super Ly7/v;
.source "SourceFile"

# interfaces
.implements Lx7/a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LI7/o;-><init>(LI7/n;Ljava/lang/String;Ljava/lang/String;LO7/y;Ljava/lang/Object;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic D:LI7/o;

.field final synthetic E:Ljava/lang/String;


# direct methods
.method constructor <init>(LI7/o;Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, LI7/o$c;->D:LI7/o;

    iput-object p2, p0, LI7/o$c;->E:Ljava/lang/String;

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Ly7/v;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a()LO7/y;
    .locals 3

    iget-object v0, p0, LI7/o$c;->D:LI7/o;

    invoke-virtual {v0}, LI7/o;->t()LI7/n;

    move-result-object v0

    iget-object v1, p0, LI7/o$c;->E:Ljava/lang/String;

    iget-object v2, p0, LI7/o$c;->D:LI7/o;

    invoke-static {v2}, LI7/o;->J(LI7/o;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, LI7/n;->m(Ljava/lang/String;Ljava/lang/String;)LO7/y;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic b()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, LI7/o$c;->a()LO7/y;

    move-result-object v0

    return-object v0
.end method
