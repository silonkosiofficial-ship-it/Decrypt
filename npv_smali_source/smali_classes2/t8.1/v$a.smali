.class final Lt8/v$a;
.super Ly7/v;
.source "SourceFile"

# interfaces
.implements Lx7/l;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lt8/v;-><init>(Ljava/util/List;LF8/E;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic D:LF8/E;


# direct methods
.method constructor <init>(LF8/E;)V
    .locals 0

    iput-object p1, p0, Lt8/v$a;->D:LF8/E;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Ly7/v;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(LO7/G;)LF8/E;
    .locals 1

    const-string v0, "it"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p1, p0, Lt8/v$a;->D:LF8/E;

    return-object p1
.end method

.method public bridge synthetic l(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LO7/G;

    invoke-virtual {p0, p1}, Lt8/v$a;->a(LO7/G;)LF8/E;

    move-result-object p1

    return-object p1
.end method
