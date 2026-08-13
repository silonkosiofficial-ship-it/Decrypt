.class LR7/s$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lx7/l;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LR7/s;->I0()LO7/h0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic C:LR7/s;


# direct methods
.method constructor <init>(LR7/s;)V
    .locals 0

    iput-object p1, p0, LR7/s$b;->C:LR7/s;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(LF8/M;)LF8/M;
    .locals 1

    iget-object v0, p0, LR7/s$b;->C:LR7/s;

    invoke-static {v0, p1}, LR7/s;->O0(LR7/s;LF8/M;)LF8/M;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic l(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LF8/M;

    invoke-virtual {p0, p1}, LR7/s$b;->a(LF8/M;)LF8/M;

    move-result-object p1

    return-object p1
.end method
