.class public final synthetic LC6/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lx7/l;


# instance fields
.field public final synthetic C:LC6/c;


# direct methods
.method public synthetic constructor <init>(LC6/c;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LC6/a;->C:LC6/c;

    return-void
.end method


# virtual methods
.method public final l(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, LC6/a;->C:LC6/c;

    check-cast p1, Ljava/lang/Throwable;

    invoke-static {v0, p1}, LC6/c;->a(LC6/c;Ljava/lang/Throwable;)Li7/M;

    move-result-object p1

    return-object p1
.end method
