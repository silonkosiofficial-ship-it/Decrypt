.class public final Lf8/k;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private final a:Lf8/q;

.field private final b:Ljava/util/List;


# direct methods
.method public constructor <init>(Lf8/q;Ljava/util/List;)V
    .locals 1

    const-string v0, "parametersInfo"

    invoke-static {p2, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lf8/k;->a:Lf8/q;

    iput-object p2, p0, Lf8/k;->b:Ljava/util/List;

    return-void
.end method


# virtual methods
.method public final a()Ljava/util/List;
    .locals 1

    iget-object v0, p0, Lf8/k;->b:Ljava/util/List;

    return-object v0
.end method

.method public final b()Lf8/q;
    .locals 1

    iget-object v0, p0, Lf8/k;->a:Lf8/q;

    return-object v0
.end method
