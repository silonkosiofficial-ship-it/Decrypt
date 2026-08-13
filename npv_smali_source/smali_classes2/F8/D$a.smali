.class final LF8/D$a;
.super Ly7/v;
.source "SourceFile"

# interfaces
.implements Lx7/l;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LF8/D;->c()LF8/M;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic D:LF8/D;


# direct methods
.method constructor <init>(LF8/D;)V
    .locals 0

    iput-object p1, p0, LF8/D$a;->D:LF8/D;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Ly7/v;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(LG8/g;)LF8/M;
    .locals 1

    const-string v0, "kotlinTypeRefiner"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, LF8/D$a;->D:LF8/D;

    invoke-virtual {v0, p1}, LF8/D;->g(LG8/g;)LF8/D;

    move-result-object p1

    invoke-virtual {p1}, LF8/D;->c()LF8/M;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic l(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LG8/g;

    invoke-virtual {p0, p1}, LF8/D$a;->a(LG8/g;)LF8/M;

    move-result-object p1

    return-object p1
.end method
