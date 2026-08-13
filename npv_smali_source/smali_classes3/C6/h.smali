.class public final synthetic LC6/h;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lx7/l;


# instance fields
.field public final synthetic C:LI6/r;


# direct methods
.method public synthetic constructor <init>(LI6/r;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LC6/h;->C:LI6/r;

    return-void
.end method


# virtual methods
.method public final l(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, LC6/h;->C:LI6/r;

    check-cast p1, LC6/c;

    invoke-static {v0, p1}, LC6/j;->b(LI6/r;LC6/c;)Li7/M;

    move-result-object p1

    return-object p1
.end method
