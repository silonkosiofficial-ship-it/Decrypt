.class public final synthetic Lf9/e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lx7/l;


# instance fields
.field public final synthetic C:Lf9/f;

.field public final synthetic D:Lf9/f$a;


# direct methods
.method public synthetic constructor <init>(Lf9/f;Lf9/f$a;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lf9/e;->C:Lf9/f;

    iput-object p2, p0, Lf9/e;->D:Lf9/f$a;

    return-void
.end method


# virtual methods
.method public final l(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    iget-object v0, p0, Lf9/e;->C:Lf9/f;

    iget-object v1, p0, Lf9/e;->D:Lf9/f$a;

    check-cast p1, Ljava/lang/Throwable;

    invoke-static {v0, v1, p1}, Lf9/f$a;->c(Lf9/f;Lf9/f$a;Ljava/lang/Throwable;)Li7/M;

    move-result-object p1

    return-object p1
.end method
