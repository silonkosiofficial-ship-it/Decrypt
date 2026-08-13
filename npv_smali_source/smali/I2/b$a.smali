.class public final LI2/b$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LI2/b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# instance fields
.field a:Z

.field b:Z

.field c:LI2/k;

.field d:Z

.field e:Z

.field f:J

.field g:J

.field h:LI2/c;


# direct methods
.method public constructor <init>()V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    iput-boolean v0, p0, LI2/b$a;->a:Z

    iput-boolean v0, p0, LI2/b$a;->b:Z

    sget-object v1, LI2/k;->C:LI2/k;

    iput-object v1, p0, LI2/b$a;->c:LI2/k;

    iput-boolean v0, p0, LI2/b$a;->d:Z

    iput-boolean v0, p0, LI2/b$a;->e:Z

    const-wide/16 v0, -0x1

    iput-wide v0, p0, LI2/b$a;->f:J

    iput-wide v0, p0, LI2/b$a;->g:J

    new-instance v0, LI2/c;

    invoke-direct {v0}, LI2/c;-><init>()V

    iput-object v0, p0, LI2/b$a;->h:LI2/c;

    return-void
.end method


# virtual methods
.method public a()LI2/b;
    .locals 1

    new-instance v0, LI2/b;

    invoke-direct {v0, p0}, LI2/b;-><init>(LI2/b$a;)V

    return-object v0
.end method

.method public b(LI2/k;)LI2/b$a;
    .locals 0

    iput-object p1, p0, LI2/b$a;->c:LI2/k;

    return-object p0
.end method
