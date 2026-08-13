.class public final Lf8/e;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lf8/e$a;
    }
.end annotation


# static fields
.field public static final e:Lf8/e$a;

.field private static final f:Lf8/e;


# instance fields
.field private final a:Lf8/h;

.field private final b:Lf8/f;

.field private final c:Z

.field private final d:Z


# direct methods
.method static constructor <clinit>()V
    .locals 9

    new-instance v0, Lf8/e$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lf8/e$a;-><init>(Ly7/k;)V

    sput-object v0, Lf8/e;->e:Lf8/e$a;

    new-instance v0, Lf8/e;

    const/16 v7, 0x8

    const/4 v8, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    move-object v2, v0

    invoke-direct/range {v2 .. v8}, Lf8/e;-><init>(Lf8/h;Lf8/f;ZZILy7/k;)V

    sput-object v0, Lf8/e;->f:Lf8/e;

    return-void
.end method

.method public constructor <init>(Lf8/h;Lf8/f;ZZ)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lf8/e;->a:Lf8/h;

    iput-object p2, p0, Lf8/e;->b:Lf8/f;

    iput-boolean p3, p0, Lf8/e;->c:Z

    iput-boolean p4, p0, Lf8/e;->d:Z

    return-void
.end method

.method public synthetic constructor <init>(Lf8/h;Lf8/f;ZZILy7/k;)V
    .locals 0

    .prologue
    and-int/lit8 p5, p5, 0x8

    if-eqz p5, :cond_0

    const/4 p4, 0x0

    :cond_0
    invoke-direct {p0, p1, p2, p3, p4}, Lf8/e;-><init>(Lf8/h;Lf8/f;ZZ)V

    return-void
.end method

.method public static final synthetic a()Lf8/e;
    .locals 1

    sget-object v0, Lf8/e;->f:Lf8/e;

    return-object v0
.end method


# virtual methods
.method public final b()Z
    .locals 1

    iget-boolean v0, p0, Lf8/e;->c:Z

    return v0
.end method

.method public final c()Lf8/f;
    .locals 1

    iget-object v0, p0, Lf8/e;->b:Lf8/f;

    return-object v0
.end method

.method public final d()Lf8/h;
    .locals 1

    iget-object v0, p0, Lf8/e;->a:Lf8/h;

    return-object v0
.end method

.method public final e()Z
    .locals 1

    iget-boolean v0, p0, Lf8/e;->d:Z

    return v0
.end method
