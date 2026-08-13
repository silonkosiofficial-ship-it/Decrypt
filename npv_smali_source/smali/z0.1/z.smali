.class public abstract Lz0/z;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final a:Lz0/w;

.field private static final b:Lz0/w;

.field private static final c:Lz0/w;

.field private static final d:Lz0/w;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lz0/a;

    const/16 v1, 0x3e8

    invoke-direct {v0, v1}, Lz0/a;-><init>(I)V

    sput-object v0, Lz0/z;->a:Lz0/w;

    new-instance v0, Lz0/a;

    const/16 v1, 0x3ef

    invoke-direct {v0, v1}, Lz0/a;-><init>(I)V

    sput-object v0, Lz0/z;->b:Lz0/w;

    new-instance v0, Lz0/a;

    const/16 v1, 0x3f0

    invoke-direct {v0, v1}, Lz0/a;-><init>(I)V

    sput-object v0, Lz0/z;->c:Lz0/w;

    new-instance v0, Lz0/a;

    const/16 v1, 0x3ea

    invoke-direct {v0, v1}, Lz0/a;-><init>(I)V

    sput-object v0, Lz0/z;->d:Lz0/w;

    return-void
.end method

.method public static final a(I)Lz0/w;
    .locals 1

    new-instance v0, Lz0/a;

    invoke-direct {v0, p0}, Lz0/a;-><init>(I)V

    return-object v0
.end method

.method public static final b()Lz0/w;
    .locals 1

    sget-object v0, Lz0/z;->b:Lz0/w;

    return-object v0
.end method

.method public static final c()Lz0/w;
    .locals 1

    sget-object v0, Lz0/z;->a:Lz0/w;

    return-object v0
.end method

.method public static final d()Lz0/w;
    .locals 1

    sget-object v0, Lz0/z;->d:Lz0/w;

    return-object v0
.end method

.method public static final e()Lz0/w;
    .locals 1

    sget-object v0, Lz0/z;->c:Lz0/w;

    return-object v0
.end method
