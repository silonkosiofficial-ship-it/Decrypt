.class public final synthetic LI6/f;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lx7/l;


# instance fields
.field public final synthetic C:LC6/j;


# direct methods
.method public synthetic constructor <init>(LC6/j;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LI6/f;->C:LC6/j;

    return-void
.end method


# virtual methods
.method public final l(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, LI6/f;->C:LC6/j;

    check-cast p1, LI6/n;

    invoke-static {v0, p1}, LI6/g;->a(LC6/j;LI6/n;)Li7/M;

    move-result-object p1

    return-object p1
.end method
