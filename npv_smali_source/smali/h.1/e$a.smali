.class final Lh/e$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lh/e;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1a
    name = "a"
.end annotation


# instance fields
.field private final a:Lh/b;

.field private final b:Li/a;


# direct methods
.method public constructor <init>(Lh/b;Li/a;)V
    .locals 1

    const-string v0, "callback"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "contract"

    invoke-static {p2, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lh/e$a;->a:Lh/b;

    iput-object p2, p0, Lh/e$a;->b:Li/a;

    return-void
.end method


# virtual methods
.method public final a()Lh/b;
    .locals 1

    iget-object v0, p0, Lh/e$a;->a:Lh/b;

    return-object v0
.end method

.method public final b()Li/a;
    .locals 1

    iget-object v0, p0, Lh/e$a;->b:Li/a;

    return-object v0
.end method
