.class final LF8/f$e$c;
.super Ly7/v;
.source "SourceFile"

# interfaces
.implements Lx7/l;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LF8/f$e;->a(LF8/f$b;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic D:LF8/f;


# direct methods
.method constructor <init>(LF8/f;)V
    .locals 0

    iput-object p1, p0, LF8/f$e$c;->D:LF8/f;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Ly7/v;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(LF8/e0;)Ljava/lang/Iterable;
    .locals 2

    const-string v0, "it"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, LF8/f$e$c;->D:LF8/f;

    const/4 v1, 0x0

    invoke-static {v0, p1, v1}, LF8/f;->e(LF8/f;LF8/e0;Z)Ljava/util/Collection;

    move-result-object p1

    check-cast p1, Ljava/lang/Iterable;

    return-object p1
.end method

.method public bridge synthetic l(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LF8/e0;

    invoke-virtual {p0, p1}, LF8/f$e$c;->a(LF8/e0;)Ljava/lang/Iterable;

    move-result-object p1

    return-object p1
.end method
