.class public final synthetic Lf9/h;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lx7/q;


# instance fields
.field public final synthetic C:Lf9/i;


# direct methods
.method public synthetic constructor <init>(Lf9/i;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lf9/h;->C:Lf9/i;

    return-void
.end method


# virtual methods
.method public final j(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lf9/h;->C:Lf9/i;

    check-cast p1, Ljava/lang/Throwable;

    check-cast p2, Li7/M;

    check-cast p3, Lm7/i;

    invoke-static {v0, p1, p2, p3}, Lf9/i;->e(Lf9/i;Ljava/lang/Throwable;Li7/M;Lm7/i;)Li7/M;

    move-result-object p1

    return-object p1
.end method
