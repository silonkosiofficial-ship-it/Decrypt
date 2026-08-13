.class public final synthetic Lio/ktor/utils/io/i;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lx7/l;


# instance fields
.field public final synthetic C:Lio/ktor/utils/io/a;


# direct methods
.method public synthetic constructor <init>(Lio/ktor/utils/io/a;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lio/ktor/utils/io/i;->C:Lio/ktor/utils/io/a;

    return-void
.end method


# virtual methods
.method public final l(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lio/ktor/utils/io/i;->C:Lio/ktor/utils/io/a;

    check-cast p1, Ljava/lang/Throwable;

    invoke-static {v0, p1}, Lio/ktor/utils/io/k;->b(Lio/ktor/utils/io/a;Ljava/lang/Throwable;)Li7/M;

    move-result-object p1

    return-object p1
.end method
