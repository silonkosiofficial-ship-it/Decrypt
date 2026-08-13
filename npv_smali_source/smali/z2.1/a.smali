.class public final Lz2/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lz2/g;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lz2/a$a;
    }
.end annotation


# static fields
.field public static final E:Lz2/a$a;


# instance fields
.field private final C:Ljava/lang/String;

.field private final D:[Ljava/lang/Object;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lz2/a$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lz2/a$a;-><init>(Ly7/k;)V

    sput-object v0, Lz2/a;->E:Lz2/a$a;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;)V
    .locals 1

    const-string v0, "query"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x0

    invoke-direct {p0, p1, v0}, Lz2/a;-><init>(Ljava/lang/String;[Ljava/lang/Object;)V

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;[Ljava/lang/Object;)V
    .locals 1

    const-string v0, "query"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lz2/a;->C:Ljava/lang/String;

    iput-object p2, p0, Lz2/a;->D:[Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public a()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lz2/a;->C:Ljava/lang/String;

    return-object v0
.end method

.method public f(Lz2/f;)V
    .locals 2

    const-string v0, "statement"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lz2/a;->E:Lz2/a$a;

    iget-object v1, p0, Lz2/a;->D:[Ljava/lang/Object;

    invoke-virtual {v0, p1, v1}, Lz2/a$a;->b(Lz2/f;[Ljava/lang/Object;)V

    return-void
.end method
