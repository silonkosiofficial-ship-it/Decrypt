.class public abstract Lja/a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lja/a$b;
    }
.end annotation


# static fields
.field private static final a:[Lja/a$b;

.field private static final b:Ljava/util/List;

.field static volatile c:[Lja/a$b;

.field private static final d:Lja/a$b;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    const/4 v0, 0x0

    new-array v0, v0, [Lja/a$b;

    sput-object v0, Lja/a;->a:[Lja/a$b;

    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    sput-object v1, Lja/a;->b:Ljava/util/List;

    sput-object v0, Lja/a;->c:[Lja/a$b;

    new-instance v0, Lja/a$a;

    invoke-direct {v0}, Lja/a$a;-><init>()V

    sput-object v0, Lja/a;->d:Lja/a$b;

    return-void
.end method

.method public static varargs a(Ljava/lang/String;[Ljava/lang/Object;)V
    .locals 1

    sget-object v0, Lja/a;->d:Lja/a$b;

    invoke-virtual {v0, p0, p1}, Lja/a$b;->a(Ljava/lang/String;[Ljava/lang/Object;)V

    return-void
.end method

.method public static varargs b(Ljava/lang/String;[Ljava/lang/Object;)V
    .locals 1

    sget-object v0, Lja/a;->d:Lja/a$b;

    invoke-virtual {v0, p0, p1}, Lja/a$b;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    return-void
.end method

.method public static varargs c(Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    .locals 1

    sget-object v0, Lja/a;->d:Lja/a$b;

    invoke-virtual {v0, p0, p1, p2}, Lja/a$b;->c(Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V

    return-void
.end method

.method public static varargs d(Ljava/lang/String;[Ljava/lang/Object;)V
    .locals 1

    sget-object v0, Lja/a;->d:Lja/a$b;

    invoke-virtual {v0, p0, p1}, Lja/a$b;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    return-void
.end method

.method public static varargs e(Ljava/lang/String;[Ljava/lang/Object;)V
    .locals 1

    sget-object v0, Lja/a;->d:Lja/a$b;

    invoke-virtual {v0, p0, p1}, Lja/a$b;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    return-void
.end method

.method public static varargs f(Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    .locals 1

    sget-object v0, Lja/a;->d:Lja/a$b;

    invoke-virtual {v0, p0, p1, p2}, Lja/a$b;->f(Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V

    return-void
.end method
