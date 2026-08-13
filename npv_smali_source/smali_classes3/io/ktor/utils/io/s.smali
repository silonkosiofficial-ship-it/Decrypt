.class public final Lio/ktor/utils/io/s;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lio/ktor/utils/io/m;


# instance fields
.field private final a:Lio/ktor/utils/io/d;

.field private final b:LW8/z0;


# direct methods
.method public constructor <init>(Lio/ktor/utils/io/d;LW8/z0;)V
    .locals 1

    const-string v0, "channel"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "job"

    invoke-static {p2, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lio/ktor/utils/io/s;->a:Lio/ktor/utils/io/d;

    iput-object p2, p0, Lio/ktor/utils/io/s;->b:LW8/z0;

    return-void
.end method


# virtual methods
.method public a()LW8/z0;
    .locals 1

    iget-object v0, p0, Lio/ktor/utils/io/s;->b:LW8/z0;

    return-object v0
.end method

.method public final b()Lio/ktor/utils/io/d;
    .locals 1

    iget-object v0, p0, Lio/ktor/utils/io/s;->a:Lio/ktor/utils/io/d;

    return-object v0
.end method
