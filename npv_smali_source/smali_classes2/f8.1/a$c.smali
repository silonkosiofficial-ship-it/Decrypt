.class final Lf8/a$c;
.super Ly7/v;
.source "SourceFile"

# interfaces
.implements Lx7/l;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lf8/a;->e(Lf8/a$a;)Lf8/e;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic D:Lf8/a;

.field final synthetic E:Lf8/a$a;


# direct methods
.method constructor <init>(Lf8/a;Lf8/a$a;)V
    .locals 0

    iput-object p1, p0, Lf8/a$c;->D:Lf8/a;

    iput-object p2, p0, Lf8/a$c;->E:Lf8/a$a;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Ly7/v;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/Object;)Ljava/lang/Boolean;
    .locals 2

    const-string v0, "$this$extractNullability"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lf8/a$c;->D:Lf8/a;

    iget-object v1, p0, Lf8/a$c;->E:Lf8/a$a;

    invoke-virtual {v1}, Lf8/a$a;->b()LJ8/i;

    move-result-object v1

    invoke-virtual {v0, p1, v1}, Lf8/a;->h(Ljava/lang/Object;LJ8/i;)Z

    move-result p1

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic l(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    invoke-virtual {p0, p1}, Lf8/a$c;->a(Ljava/lang/Object;)Ljava/lang/Boolean;

    move-result-object p1

    return-object p1
.end method
