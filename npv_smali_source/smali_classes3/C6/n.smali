.class public final synthetic LC6/n;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lx7/l;


# instance fields
.field public final synthetic C:LF6/b;


# direct methods
.method public synthetic constructor <init>(LF6/b;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LC6/n;->C:LF6/b;

    return-void
.end method


# virtual methods
.method public final l(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, LC6/n;->C:LF6/b;

    check-cast p1, Ljava/lang/Throwable;

    invoke-static {v0, p1}, LC6/o;->a(LF6/b;Ljava/lang/Throwable;)Li7/M;

    move-result-object p1

    return-object p1
.end method
