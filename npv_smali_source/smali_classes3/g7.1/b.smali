.class public abstract Lg7/b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lg7/b$a;,
        Lg7/b$b;,
        Lg7/b$c;,
        Lg7/b$d;
    }
.end annotation


# static fields
.field public static final i:Lg7/b$c;

.field private static final j:[B


# instance fields
.field private final a:Z

.field private final b:Lg7/d;

.field private final c:[B

.field private final d:LW8/f0;

.field private final e:Z

.field private final f:Z

.field private final g:Z

.field private final h:Ljava/nio/ByteBuffer;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lg7/b$c;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lg7/b$c;-><init>(Ly7/k;)V

    sput-object v0, Lg7/b;->i:Lg7/b$c;

    const/4 v0, 0x0

    new-array v0, v0, [B

    sput-object v0, Lg7/b;->j:[B

    return-void
.end method

.method private constructor <init>(ZLg7/d;[BLW8/f0;ZZZ)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-boolean p1, p0, Lg7/b;->a:Z

    iput-object p2, p0, Lg7/b;->b:Lg7/d;

    iput-object p3, p0, Lg7/b;->c:[B

    iput-object p4, p0, Lg7/b;->d:LW8/f0;

    iput-boolean p5, p0, Lg7/b;->e:Z

    iput-boolean p6, p0, Lg7/b;->f:Z

    iput-boolean p7, p0, Lg7/b;->g:Z

    invoke-static {p3}, Ljava/nio/ByteBuffer;->wrap([B)Ljava/nio/ByteBuffer;

    move-result-object p1

    const-string p2, "wrap(...)"

    invoke-static {p1, p2}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lg7/b;->h:Ljava/nio/ByteBuffer;

    return-void
.end method

.method public synthetic constructor <init>(ZLg7/d;[BLW8/f0;ZZZLy7/k;)V
    .locals 0

    invoke-direct/range {p0 .. p7}, Lg7/b;-><init>(ZLg7/d;[BLW8/f0;ZZZ)V

    return-void
.end method


# virtual methods
.method public final a()[B
    .locals 1

    iget-object v0, p0, Lg7/b;->c:[B

    return-object v0
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Frame "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lg7/b;->b:Lg7/d;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, " (fin="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-boolean v1, p0, Lg7/b;->a:Z

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v1, ", buffer len = "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lg7/b;->c:[B

    array-length v1, v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const/16 v1, 0x29

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
