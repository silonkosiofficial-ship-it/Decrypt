.class final LF8/h0$c;
.super Ly7/v;
.source "SourceFile"

# interfaces
.implements Lx7/a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LF8/h0;-><init>(LF8/v;LF8/g0;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic D:LF8/h0;


# direct methods
.method constructor <init>(LF8/h0;)V
    .locals 0

    iput-object p1, p0, LF8/h0$c;->D:LF8/h0;

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Ly7/v;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a()LH8/h;
    .locals 2

    sget-object v0, LH8/j;->Y0:LH8/j;

    iget-object v1, p0, LF8/h0$c;->D:LF8/h0;

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    filled-new-array {v1}, [Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, LH8/k;->d(LH8/j;[Ljava/lang/String;)LH8/h;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic b()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, LF8/h0$c;->a()LH8/h;

    move-result-object v0

    return-object v0
.end method
