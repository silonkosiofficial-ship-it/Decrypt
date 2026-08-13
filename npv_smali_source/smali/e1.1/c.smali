.class public final Le1/c;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private a:Le1/f;

.field private b:Le1/f;

.field private c:Le1/f;

.field private d:[Le1/i;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>()V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Le1/g;

    const/16 v1, 0x100

    invoke-direct {v0, v1}, Le1/g;-><init>(I)V

    iput-object v0, p0, Le1/c;->a:Le1/f;

    new-instance v0, Le1/g;

    invoke-direct {v0, v1}, Le1/g;-><init>(I)V

    iput-object v0, p0, Le1/c;->b:Le1/f;

    new-instance v0, Le1/g;

    invoke-direct {v0, v1}, Le1/g;-><init>(I)V

    iput-object v0, p0, Le1/c;->c:Le1/f;

    const/16 v0, 0x20

    new-array v0, v0, [Le1/i;

    iput-object v0, p0, Le1/c;->d:[Le1/i;

    return-void
.end method


# virtual methods
.method public final a()Le1/f;
    .locals 1

    iget-object v0, p0, Le1/c;->b:Le1/f;

    return-object v0
.end method

.method public final b()[Le1/i;
    .locals 1

    iget-object v0, p0, Le1/c;->d:[Le1/i;

    return-object v0
.end method

.method public final c()Le1/f;
    .locals 1

    iget-object v0, p0, Le1/c;->a:Le1/f;

    return-object v0
.end method

.method public final d()Le1/f;
    .locals 1

    iget-object v0, p0, Le1/c;->c:Le1/f;

    return-object v0
.end method

.method public final e([Le1/i;)V
    .locals 1

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Le1/c;->d:[Le1/i;

    return-void
.end method
