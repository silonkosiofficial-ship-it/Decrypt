.class final Lh2/y$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lh2/y;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1a
    name = "a"
.end annotation


# instance fields
.field private final a:Lh2/z;

.field private final b:Lh2/M;

.field private final c:LW8/z0;


# direct methods
.method public constructor <init>(Lh2/z;Lh2/M;LW8/z0;)V
    .locals 1

    const-string v0, "snapshot"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "job"

    invoke-static {p3, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lh2/y$a;->a:Lh2/z;

    iput-object p2, p0, Lh2/y$a;->b:Lh2/M;

    iput-object p3, p0, Lh2/y$a;->c:LW8/z0;

    return-void
.end method


# virtual methods
.method public final a()LW8/z0;
    .locals 1

    iget-object v0, p0, Lh2/y$a;->c:LW8/z0;

    return-object v0
.end method

.method public final b()Lh2/z;
    .locals 1

    iget-object v0, p0, Lh2/y$a;->a:Lh2/z;

    return-object v0
.end method

.method public final c()Lh2/M;
    .locals 1

    iget-object v0, p0, Lh2/y$a;->b:Lh2/M;

    return-object v0
.end method
