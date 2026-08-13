.class public final Lio/ktor/utils/io/d$a$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lio/ktor/utils/io/d;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lio/ktor/utils/io/d$a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field private final b:Ljava/lang/Throwable;

.field private final c:Lo9/q;


# direct methods
.method constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Lo9/a;

    invoke-direct {v0}, Lo9/a;-><init>()V

    iput-object v0, p0, Lio/ktor/utils/io/d$a$a;->c:Lo9/q;

    return-void
.end method


# virtual methods
.method public a()Ljava/lang/Throwable;
    .locals 1

    iget-object v0, p0, Lio/ktor/utils/io/d$a$a;->b:Ljava/lang/Throwable;

    return-object v0
.end method

.method public d()Lo9/q;
    .locals 1

    iget-object v0, p0, Lio/ktor/utils/io/d$a$a;->c:Lo9/q;

    return-object v0
.end method

.method public f(ILm7/e;)Ljava/lang/Object;
    .locals 0

    const/4 p1, 0x0

    invoke-static {p1}, Lo7/b;->a(Z)Ljava/lang/Boolean;

    move-result-object p1

    return-object p1
.end method

.method public h()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method public k(Ljava/lang/Throwable;)V
    .locals 0

    return-void
.end method
