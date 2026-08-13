.class final LF8/f$e$b;
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

    iput-object p1, p0, LF8/f$e$b;->D:LF8/f;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Ly7/v;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(LF8/E;)V
    .locals 1

    const-string v0, "it"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, LF8/f$e$b;->D:LF8/f;

    invoke-virtual {v0, p1}, LF8/f;->n(LF8/E;)V

    return-void
.end method

.method public bridge synthetic l(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LF8/E;

    invoke-virtual {p0, p1}, LF8/f$e$b;->a(LF8/E;)V

    sget-object p1, Li7/M;->a:Li7/M;

    return-object p1
.end method
