.class public final LV/o0;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private final a:Ljava/lang/Object;

.field private final b:LV/G;

.field private final c:LV/h1;

.field private final d:LV/d;

.field private e:Ljava/util/List;

.field private final f:LV/H0;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(LV/m0;Ljava/lang/Object;LV/G;LV/h1;LV/d;Ljava/util/List;LV/H0;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, LV/o0;->a:Ljava/lang/Object;

    iput-object p3, p0, LV/o0;->b:LV/G;

    iput-object p4, p0, LV/o0;->c:LV/h1;

    iput-object p5, p0, LV/o0;->d:LV/d;

    iput-object p6, p0, LV/o0;->e:Ljava/util/List;

    iput-object p7, p0, LV/o0;->f:LV/H0;

    return-void
.end method


# virtual methods
.method public final a()LV/d;
    .locals 1

    iget-object v0, p0, LV/o0;->d:LV/d;

    return-object v0
.end method

.method public final b()LV/G;
    .locals 1

    iget-object v0, p0, LV/o0;->b:LV/G;

    return-object v0
.end method

.method public final c()LV/m0;
    .locals 1

    const/4 v0, 0x0

    return-object v0
.end method

.method public final d()Ljava/util/List;
    .locals 1

    iget-object v0, p0, LV/o0;->e:Ljava/util/List;

    return-object v0
.end method

.method public final e()LV/H0;
    .locals 1

    iget-object v0, p0, LV/o0;->f:LV/H0;

    return-object v0
.end method

.method public final f()Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, LV/o0;->a:Ljava/lang/Object;

    return-object v0
.end method

.method public final g()LV/h1;
    .locals 1

    iget-object v0, p0, LV/o0;->c:LV/h1;

    return-object v0
.end method
