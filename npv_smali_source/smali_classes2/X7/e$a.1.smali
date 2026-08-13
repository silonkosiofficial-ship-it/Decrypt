.class final LX7/e$a;
.super Ly7/v;
.source "SourceFile"

# interfaces
.implements Lx7/l;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LX7/e;->j(LO7/Z;)Z
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic D:LO7/Z;


# direct methods
.method constructor <init>(LO7/Z;)V
    .locals 0

    iput-object p1, p0, LX7/e$a;->D:LO7/Z;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Ly7/v;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(LO7/b;)Ljava/lang/Boolean;
    .locals 1

    const-string v0, "it"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object p1, LX7/I;->a:LX7/I$a;

    invoke-virtual {p1}, LX7/I$a;->j()Ljava/util/Map;

    move-result-object p1

    iget-object v0, p0, LX7/e$a;->D:LO7/Z;

    invoke-static {v0}, Lg8/y;->d(LO7/a;)Ljava/lang/String;

    move-result-object v0

    invoke-interface {p1, v0}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result p1

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic l(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LO7/b;

    invoke-virtual {p0, p1}, LX7/e$a;->a(LO7/b;)Ljava/lang/Boolean;

    move-result-object p1

    return-object p1
.end method
