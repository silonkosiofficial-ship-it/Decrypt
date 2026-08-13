.class public Lha/h;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lia/b;


# static fields
.field public static d:Ljava/lang/String;


# instance fields
.field private final a:Lfa/a;

.field private final b:Lfa/b;

.field private final c:Lia/a;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const-string v0, "2.0.99"

    sput-object v0, Lha/h;->d:Ljava/lang/String;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Lha/f;

    invoke-direct {v0}, Lha/f;-><init>()V

    iput-object v0, p0, Lha/h;->a:Lfa/a;

    new-instance v0, Lha/c;

    invoke-direct {v0}, Lha/c;-><init>()V

    iput-object v0, p0, Lha/h;->b:Lfa/b;

    new-instance v0, Lha/g;

    invoke-direct {v0}, Lha/g;-><init>()V

    iput-object v0, p0, Lha/h;->c:Lia/a;

    return-void
.end method


# virtual methods
.method public a()V
    .locals 0

    return-void
.end method

.method public b()Lfa/a;
    .locals 1

    iget-object v0, p0, Lha/h;->a:Lfa/a;

    return-object v0
.end method

.method public c()Ljava/lang/String;
    .locals 1

    sget-object v0, Lha/h;->d:Ljava/lang/String;

    return-object v0
.end method
