.class final LH/Y$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LH/Y;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1a
    name = "a"
.end annotation


# instance fields
.field private a:LH/Y$a;

.field private b:LS0/V;


# direct methods
.method public constructor <init>(LH/Y$a;LS0/V;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LH/Y$a;->a:LH/Y$a;

    iput-object p2, p0, LH/Y$a;->b:LS0/V;

    return-void
.end method


# virtual methods
.method public final a()LH/Y$a;
    .locals 1

    iget-object v0, p0, LH/Y$a;->a:LH/Y$a;

    return-object v0
.end method

.method public final b()LS0/V;
    .locals 1

    iget-object v0, p0, LH/Y$a;->b:LS0/V;

    return-object v0
.end method

.method public final c(LH/Y$a;)V
    .locals 0

    iput-object p1, p0, LH/Y$a;->a:LH/Y$a;

    return-void
.end method

.method public final d(LS0/V;)V
    .locals 0

    iput-object p1, p0, LH/Y$a;->b:LS0/V;

    return-void
.end method
