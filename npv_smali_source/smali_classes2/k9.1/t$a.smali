.class final Lk9/t$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lk9/t;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1a
    name = "a"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lk9/t$a$a;
    }
.end annotation


# static fields
.field public static final c:Lk9/t$a$a;


# instance fields
.field private final a:Lk9/b;

.field private final b:Ljava/lang/Object;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lk9/t$a$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lk9/t$a$a;-><init>(Ly7/k;)V

    sput-object v0, Lk9/t$a;->c:Lk9/t$a$a;

    return-void
.end method

.method private constructor <init>(Lk9/b;Ljava/lang/Object;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lk9/t$a;->a:Lk9/b;

    iput-object p2, p0, Lk9/t$a;->b:Ljava/lang/Object;

    return-void
.end method

.method public synthetic constructor <init>(Lk9/b;Ljava/lang/Object;Ly7/k;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Lk9/t$a;-><init>(Lk9/b;Ljava/lang/Object;)V

    return-void
.end method

.method public static final synthetic a(Lk9/t$a;)Lk9/b;
    .locals 0

    iget-object p0, p0, Lk9/t$a;->a:Lk9/b;

    return-object p0
.end method

.method public static final synthetic b(Lk9/t$a;)Ljava/lang/Object;
    .locals 0

    iget-object p0, p0, Lk9/t$a;->b:Ljava/lang/Object;

    return-object p0
.end method
