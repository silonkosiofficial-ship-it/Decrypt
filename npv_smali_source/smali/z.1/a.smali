.class public final Lz/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lz/i;


# instance fields
.field private final a:Lz/b;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(Lz/b;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lz/a;->a:Lz/b;

    return-void
.end method


# virtual methods
.method public final a()Lz/b;
    .locals 1

    iget-object v0, p0, Lz/a;->a:Lz/b;

    return-object v0
.end method
