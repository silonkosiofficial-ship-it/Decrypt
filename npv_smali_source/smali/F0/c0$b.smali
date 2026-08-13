.class final LF0/c0$b;
.super Ly7/v;
.source "SourceFile"

# interfaces
.implements Lx7/l;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LF0/c0;->e(Landroidx/compose/ui/d;LX/b;)LX/b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic D:LX/b;


# direct methods
.method constructor <init>(LX/b;)V
    .locals 0

    iput-object p1, p0, LF0/c0$b;->D:LX/b;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Ly7/v;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Landroidx/compose/ui/d$b;)Ljava/lang/Boolean;
    .locals 1

    iget-object v0, p0, LF0/c0$b;->D:LX/b;

    invoke-virtual {v0, p1}, LX/b;->d(Ljava/lang/Object;)Z

    sget-object p1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    return-object p1
.end method

.method public bridge synthetic l(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Landroidx/compose/ui/d$b;

    invoke-virtual {p0, p1}, LF0/c0$b;->a(Landroidx/compose/ui/d$b;)Ljava/lang/Boolean;

    move-result-object p1

    return-object p1
.end method
