.class public final synthetic LF6/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lx7/l;


# instance fields
.field public final synthetic C:LC6/c;

.field public final synthetic D:LQ6/c;


# direct methods
.method public synthetic constructor <init>(LC6/c;LQ6/c;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LF6/c;->C:LC6/c;

    iput-object p2, p0, LF6/c;->D:LQ6/c;

    return-void
.end method


# virtual methods
.method public final l(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    iget-object v0, p0, LF6/c;->C:LC6/c;

    iget-object v1, p0, LF6/c;->D:LQ6/c;

    check-cast p1, Ljava/lang/Throwable;

    invoke-static {v0, v1, p1}, LF6/b$a$c;->H(LC6/c;LQ6/c;Ljava/lang/Throwable;)Li7/M;

    move-result-object p1

    return-object p1
.end method
