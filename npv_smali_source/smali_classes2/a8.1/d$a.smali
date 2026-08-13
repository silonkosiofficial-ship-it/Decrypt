.class final La8/d$a;
.super Ly7/v;
.source "SourceFile"

# interfaces
.implements Lx7/l;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = La8/d;-><init>(La8/g;Le8/d;Z)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic D:La8/d;


# direct methods
.method constructor <init>(La8/d;)V
    .locals 0

    iput-object p1, p0, La8/d$a;->D:La8/d;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Ly7/v;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Le8/a;)LP7/c;
    .locals 3

    const-string v0, "annotation"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, LY7/c;->a:LY7/c;

    iget-object v1, p0, La8/d$a;->D:La8/d;

    invoke-static {v1}, La8/d;->e(La8/d;)La8/g;

    move-result-object v1

    iget-object v2, p0, La8/d$a;->D:La8/d;

    invoke-static {v2}, La8/d;->d(La8/d;)Z

    move-result v2

    invoke-virtual {v0, p1, v1, v2}, LY7/c;->e(Le8/a;La8/g;Z)LP7/c;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic l(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Le8/a;

    invoke-virtual {p0, p1}, La8/d$a;->a(Le8/a;)LP7/c;

    move-result-object p1

    return-object p1
.end method
